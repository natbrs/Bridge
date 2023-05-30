package remotes;

import devices.Device;

// Classe AdvancedRemote que estende a classe BasicRemote
public class AdvancedRemote extends BasicRemote {

    // Construtor que recebe um dispositivo como parâmetro
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    // Método específico da classe AdvancedRemote para ativar o modo mudo
    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
