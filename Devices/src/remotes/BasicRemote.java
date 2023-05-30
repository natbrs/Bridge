package remotes;

import devices.Device;

// Classe BasicRemote que implementa a interface Remote
public class BasicRemote implements Remote {
    protected Device device;

    // Construtor que recebe um dispositivo como parâmetro
    protected BasicRemote(Device device) {
        this.device = device;
    }

    // Método para ligar/desligar o dispositivo
    public void power() {
        System.out.println("Remote: power toggle");

        // Verifica se o dispositivo está ligado ou desligado e inverte o estado
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    // Implementação do método volumeDown() da interface Remote
    @Override
    public void volumeDown() {
        System.out.println("Remote volume down");

        // Reduz o volume do dispositivo em 10 unidades
        device.setVolume(device.getVolume() - 10);
    }

    // Implementação do método volumeUp() da interface Remote
    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");

        // Aumenta o volume do dispositivo em 10 unidades
        device.setVolume(device.getVolume() + 10);
    }

    // Implementação do método channelDown() da interface Remote
    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");

        // Diminui o número do canal do dispositivo em 1
        device.setChannel(device.getChannel() - 1);
    }

    // Implementação do método channelUp() da interface Remote
    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");

        // Aumenta o número do canal do dispositivo em 1
        device.setChannel(device.getChannel() + 1);
    }
}
