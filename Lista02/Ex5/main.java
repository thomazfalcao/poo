public class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        System.out.println("Televisão\n");
        televisao.exibeTV();
        televisao.onOff();
        televisao.decCanal();
        televisao.decCanal();
        televisao.decCanal();
        televisao.exibeTV();
        televisao.defCanal(98);
        televisao.incCanal();
        televisao.incCanal();
        televisao.incCanal();
        televisao.incCanal();
        televisao.exibeTV();
        televisao.incVolume();
        televisao.incVolume();
        televisao.incVolume();
        televisao.incVolume();
        televisao.exibeTV();
        televisao.modoSilencioso();
        televisao.incVolume();
        televisao.incVolume();
        televisao.incVolume();
        televisao.exibeTV();
        televisao.onOff();
        televisao.exibeTV();
    }
    
}
