package devices;

// Classe que representa um rádio e implementa a interface Device
public class Radio implements Device {
    // Variável para armazenar se o rádio está ligado ou desligado
    private boolean on = false;

    // Variável para armazenar o volume do rádio
    private int volume = 30;

    // Variável para armazenar o canal do rádio
    private int channel = 1;

    // Implementação do método isEnabled() da interface Device
    @Override
    public boolean isEnabled() {
        return on;
    }

    // Implementação do método enable() da interface Device
    @Override
    public void enable() {
        on = true;
    }

    // Implementação do método disable() da interface Device
    @Override
    public void disable() {
        on = false;
    }

    // Implementação do método getVolume() da interface Device
    @Override
    public int getVolume() {
        return volume;
    }

    // Implementação do método setVolume(int volume) da interface Device
    @Override
    public void setVolume(int volume) {
        // Verifica se o volume está dentro do intervalo válido (entre 0 e 100)
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    // Implementação do método getChannel() da interface Device
    @Override
    public int getChannel() {
        return channel;
    }

    // Implementação do método setChannel(int channel) da interface Device
    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    // Implementação do método printStatus() da interface Device
    @Override
    public void printStatus() {
        System.out.println("----------------------------------");
        System.out.println(" I'm radio. ");
        System.out.println(" I'm " + (on ? "enabled" : "disabled"));
        System.out.println(" Current volume is " + volume + "%");
        System.out.println(" Current channel is " + channel);
        System.out.println("----------------------------------\n");
    }
}
