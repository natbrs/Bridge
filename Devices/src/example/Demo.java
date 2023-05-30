package example;

import devices.Device;

// Classe de exemplo
public class Demo {
    public static void main(String[] args) {
        // Testa um dispositivo TV
        testDevice(new Tv());

        // Testa um dispositivo Radio
        testDevice(new Radio());
    }

    // Método para testar um dispositivo
    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote");

        // Cria um controle remoto básico para o dispositivo
        BasicRemote basicRemote = new BasicRemote(device);

        // Liga o dispositivo usando o controle remoto básico
        basicRemote.power();

        // Imprime o status do dispositivo
        device.printStatus();

        System.out.println("Tests with advanced remote. ");

        // Cria um controle remoto avançado para o dispositivo
        AdvancedRemote advancedRemote = new AdvancedRemote(device);

        // Liga o dispositivo usando o controle remoto avançado
        advancedRemote.power();

        // Ativa o modo mudo no dispositivo usando o controle remoto avançado
        advancedRemote.mute();

        // Imprime o status do dispositivo
        device.printStatus();
    }
}
