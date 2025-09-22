
public class encap {
    public static void main(String[] args) {
        house p1 = new house();
        p1.setname("palace");
        System.out.println(p1.getname());
        p1.sethouseno(23);
        System.out.println(p1.gethouseno());
    }
}

class house {
    private String name;
    private int houseno;

    String getname() {            
        return this.name;
    }
    int gethouseno() {
        return this.houseno;
    }

    void setname(String newname) {     
        this.name = newname;
    }

    void sethouseno(int newhouseno) {
        this.houseno = newhouseno;
    }
}
