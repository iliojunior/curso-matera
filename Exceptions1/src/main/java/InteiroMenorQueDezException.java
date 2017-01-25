import com.sun.istack.internal.NotNull;

public class InteiroMenorQueDezException extends IllegalArgumentException {
    public InteiroMenorQueDezException() {
        super();
    }

    public InteiroMenorQueDezException(String s) {
        super(s);
    }

    @Override
    public String getMessage() {
        return "Inteiro menor que dez. "
                .concat(
                        super.getMessage() != null ? super.getMessage() : ""
                );
    }
}