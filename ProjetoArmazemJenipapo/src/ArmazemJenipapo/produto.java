package ArmazemJenipapo;

public class produto {
    
    public float id;
    public float cod;
    public String nome;
    public String desc;
    public String fornec;
    public String dtcadast;

    produto(float id, float cod, String nome, String desc, String fornec,String dtcadast){
        this.id = id;
        this.cod = cod;
        this.nome = nome;
        this.desc = desc;
        this.fornec = fornec;
        this.dtcadast = dtcadast;
    }

}
