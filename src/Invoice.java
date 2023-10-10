public class Invoice {
    String modelulDispozitivului;
    String descriereaProdusului;
    int cantitate;
    Double price;


    //getteri
    public String getModelulDispozitivului(){
        return modelulDispozitivului;
    }
    public String getDescriereaProdusului(){
        return descriereaProdusului;
    }
    public int getCantitate(){
        return cantitate;
    }
    public Double getPrice(){
        return price;
    }
    //setters

    public void setModelulDispozitivului(String modelulDispozitivului){
        this.modelulDispozitivului=modelulDispozitivului;
    }
    public void setDescriereaProdusului(String descriereaProdusului){
        this.descriereaProdusului=descriereaProdusului;
    }
    public void setCantitate(int cantitate){

        if(cantitate>0) {
            this.cantitate = cantitate;
        }
        else{
            System.out.println("Cantitatea nu poate fi negativa");
        }
    }
    public void setPrice(Double price) {
        if (price <= 0) {
            System.out.println("Magazinul nu iti plateste tie :D");

        } else {
            this.price = price;
        }
    }
    // getters and setters are done

    public void getAmount() {
        System.out.println("Dispozitivul:" + getModelulDispozitivului());
        System.out.println("Descriere:" + getDescriereaProdusului());
        double Amount = getPrice() * getCantitate();
        System.out.println("Pretul pe dispozitiv :" + getPrice());
        System.out.println("Cantitatea de dispozitive:" + getCantitate());
        System.out.println("Suma finala:" + Amount);
        if (getCantitate() > 3) {
            System.out.println("De ce ai nevoie de " + getCantitate() + getModelulDispozitivului() + "? :D");
        }


    }
}
