import java.util.Date;

public class Pessoa {

    private String nome;
    private Date nascimento;

    public Pessoa() {}

    public Pessoa(String nome, Date nascimento) {
        super();
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }


    public void verificaDataNascimento() throws DataInvalidaException {
        Date now = new Date();
        if(nascimento.after(now)) {
            try {
                throw new DataInvalidaException("A data de nascimento não pode ser uma data futura");
            } catch (DataInvalidaException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Data válida");
        }
    }
}