import java.io.*;

class Producer extends Thread {
	OutputStream os;

	public Producer(OutputStream o) {
		os = o;
	}

	@Override
	public void run() {
		int count = 1;
		while (true) {

			try {
				os.write(count);
				os.flush();
				System.out.println("pro" + count);
				System.out.flush();

				Thread.sleep(30);

				count++;
			} catch (Exception e) {
			}
		}
	}
}

class Consumer extends Thread {
	InputStream is;

	public Consumer(InputStream o) {
		is = o;
	}

	@Override
	public void run() {
		int x;
		while (true) {

			try {
				x = is.read();
				System.out.println("con" + x);
				System.out.flush();
			} catch (Exception e) {
			}
		}
	}
}

public class PipedStream {
	public static void main(String[] args) throws Exception {

		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();

		pos.connect(pis);

		Producer p = new Producer(pos);
		Consumer c = new Consumer(pis);

		p.start();
		c.start();
	}
}