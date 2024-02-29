class HorarioJogo {
    public static void main(String[] args) {
        int horaInicio = 17;
        int horaFim = 19;

        int duracao;
        if (horaFim > horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("A duração do jogo é de " + duracao + " horas.");
    }
}