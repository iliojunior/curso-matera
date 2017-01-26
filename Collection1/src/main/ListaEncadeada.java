package main;

public class ListaEncadeada {

    private No primeiro;
    private No ultimo;
    private int count = 0;

    public void adicionar(String valor) {
        final No newNos = new No(new Elemento(valor), null);
        if (primeiro == null) {
            primeiro = newNos;
        } else {
            ultimo.setProximo(newNos);
        }
        ultimo = newNos;
        count++;
    }

    public boolean remover(int indice) {
        No aux = this.primeiro;
        int index = -1;
        boolean removed = false;

        while (aux != null && !removed) {
            index++;

            if (indice == 0) {
                primeiro = primeiro.getProximo();
                removed = true;
            } else if (index + 1 == indice) {
                aux.setProximo(aux.getProximo().getProximo());
                removed = true;
            }

            aux = aux.getProximo();
        }

        count = (removed ? --count : count);
        return removed;
    }

    public void imprimir() {
        No aux = this.primeiro;
        while (aux != null) {
            System.out.println(aux.getElemento().getNome());
            aux = aux.getProximo();
        }
    }

    public boolean contem(String value) {
        No aux = this.primeiro;
        while (aux != null) {
            if (aux.getElemento().getNome().equals(value))
                return true;
            aux = aux.getProximo();
        }
        return false;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public No get(int position) {
        if (isEmpty())
            throw new IndexOutOfBoundsException("List is empty");

        No aux = this.primeiro;
        int index = -1;
        while (aux != null) {
            index++;
            if (index == position) {
                return aux;
            }
            aux = aux.getProximo();
        }

        throw new IndexOutOfBoundsException("Position not found");
    }
}