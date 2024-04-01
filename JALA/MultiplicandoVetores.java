public class MultiplicandoVetores {
    public static void main(String[] args) {
        int[] valores1 = {1,9,6,1, 1};
        int[] valores2 = {1,3,10,6,2};
        int[] resultado = new int[valores1.length];

        for(int i =0; i< valores1.length; i++){
            if(valores1.length > valores2.length || valores2.length > valores1.length){
                System.out.println("Quandidade os vetores são incompativeis: ");
                break;

            }
            resultado[i] = (valores1[i]*valores2[i]);
        }

        for(int x : resultado){
            System.out.println(x);
        }

    }
}
