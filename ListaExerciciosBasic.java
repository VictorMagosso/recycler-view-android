public class ListaExerciciosBasic {

    String tituloExercicio, textAnswer;
    String alternativaUm, alternativaDois, alternativeTres, alternativaQuatro;

    Button buttonAnswer;

    public ListaExerciciosBasic(String tituloExercicio,
                                String alternativaUm, String alternativaDois,
                                String alternativeTres, String alternativaQuatro) {
        this.tituloExercicio = tituloExercicio;
        this.alternativaUm = alternativaUm;
        this.alternativaDois = alternativaDois;
        this.alternativeTres = alternativeTres;
        this.alternativaQuatro = alternativaQuatro;
    }


    public String getTituloExercicio() {
        return tituloExercicio;
    }

    public void setTituloExercicio(String tituloExercicio) {
        this.tituloExercicio = tituloExercicio;
    }

    public String getAlternativaUm() {
        return alternativaUm;
    }

    public void setAlternativaUm(String alternativaUm) {
        this.alternativaUm = alternativaUm;
    }

    public String getAlternativaDois() {
        return alternativaDois;
    }

    public void setAlternativaDois(String alternativaDois) {
        this.alternativaDois = alternativaDois;
    }

    public String getAlternativeTres() {
        return alternativeTres;
    }

    public void setAlternativeTres(String alternativeTres) {
        this.alternativeTres = alternativeTres;
    }

    public String getAlternativaQuatro() {
        return alternativaQuatro;
    }

    public void setAlternativaQuatro(String alternativaQuatro) {
        this.alternativaQuatro = alternativaQuatro;
    }

    public Button getButtonAnswer() {
        return buttonAnswer;
    }

    public void setButtonAnswer(Button buttonAnswer) {
        this.buttonAnswer = buttonAnswer;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }
}
