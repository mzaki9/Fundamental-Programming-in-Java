public class Item {
        private String name;
    
        private Item() {
            name = "Ipin";
        }
    
        public Item(String name) {   
            this();                           //"this" is used for calling other constructor in the same class
            System.out.println(this.name);
        }
}
