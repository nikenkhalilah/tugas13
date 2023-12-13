public class App {
    public static void main(String[] args) {

        DataPelanggan D1 = new Pelanggan();     //polymorphisme

        Transaksi K01 = new Transaksi();

        K01.login();
    
    //exception    
    try {
        D1.inputDataPelanggan();
    } 
    catch (Exception e){
        System.out.println("Data yang diisi salah");
    }

        //mencetak struk
        D1.Struk();

    }
}