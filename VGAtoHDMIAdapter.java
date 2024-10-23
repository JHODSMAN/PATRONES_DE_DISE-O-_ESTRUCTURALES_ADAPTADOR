public class VGAtoHDMIAdapter implements HDMI {
    private VGA vga;

    public VGAtoHDMIAdapter(VGA vga) {
        this.vga = vga;
    }

    @Override
    public void connectWithHDMI() {
        System.out.println("Adaptando de VGA a HDMI...");
        vga.connectWithVGA();
    }
}
