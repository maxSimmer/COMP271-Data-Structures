public class lincolnService {
    
    
    
    public static void main(String[] args){
        
        trainStation pon = new trainStation();
        pon.name = "Pontiac";
        pon.next = null;

        trainStation dwi = new trainStation();
        dwi.name = "Dwight";
        dwi.next = pon;

        trainStation jol = new trainStation();
        jol.name = "Joliet";
        jol.next = dwi;

        trainStation smt = new trainStation();
        smt.name = "Summit";
        smt.next = jol;
        
        
        trainStation head = new trainStation();
        head.name = "Chicago";
        head.next = smt;

        
        System.out.println(head.name);
        System.out.println(head.next.name);
    }
}
