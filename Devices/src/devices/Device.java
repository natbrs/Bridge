package devices;

// Interface para dispositivos
public interface Device {
    // Verifica se o dispositivo está habilitado
    boolean isEnabled();

    // Habilita o dispositivo
    void enable();

    // Desabilita o dispositivo
    void disable();

    // Obtém o volume atual do dispositivo
    int getVolume();

    // Define o volume do dispositivo em porcentagem
    void setVolume(int percent);

    // Obtém o canal atual do dispositivo
    int getChannel();

    // Define o canal do dispositivo
    void setChannel(int channel);

    // Imprime o status do dispositivo
    void printStatus();
}
