package services;

import dominio.Snack;

import java.util.List;

public interface IServiceSnaks {
    void adicionarSnack(Snack snack);
    void mostrarSnacks();
    List<Snack> getSnacks();
}
