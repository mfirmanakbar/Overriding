
public class PenggunaanOverriding {

	public static void main(String[] args) {
		Binatang b = new Binatang();
		Mamalia m = new Mamalia();
		Binatang bm = new Mamalia();

		b.begerak();
		m.begerak();
		bm.begerak();
		bm.berkembangBiak();
	}

}
