package model;

public enum GameEnum {
    NON_STARTED("Não iniciado"),
    INCOMPLETE("Incompleto"),
    COMPLETE("Completo");

   private String label;

    GameEnum(final String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
