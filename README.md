# Overriding
theory review java basic

#### Method overriding merupakan method dimana `parrent class` akan ditulis kembali oleh `subclass`. Dengan aturan:
- Parameter method overriding di `subclass` dan `parent class` harus sama.
- Pengaturan hak akses method overriding pada `subclass` tidak boleh lebih ketat di bandingkan dengan hak akses method pada `parent class`.

1. Sub Class
```
public class Binatang {
	public void begerak() {
		System.out.println("Binatang bergerak sesuai kemampuannya");
	}
  
	public void berkembangBiak() {
		System.out.println("Binatang berkembang biak sesuai kemampuannya");
	}
}

```

2. Parent Class
```
public class Mamalia extends Binatang {
    //overriding method parent class
    public void begerak(){
        System.out.println("Mamalia bergerak sebagian besar dengan kakinya");
    }    
    
    public void berlari(){
        System.out.println("Sebagian Mamalia dapat berlari");
    }
}
```

3. Main Class
```

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
```

4. The Results
```
Binatang bergerak sesuai kemampuannya
Mamalia bergerak sebagian besar dengan kakinya
Mamalia bergerak sebagian besar dengan kakinya
Binatang berkembang biak sesuai kemampuannya
```
