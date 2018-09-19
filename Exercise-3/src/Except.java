public class Except {
    public static void main(String[] args) {
        TypesOfExceptions exceptions = new TypesOfExceptions(3);
        exceptions.findException();
    }
}
    class TypesOfExceptions {
        int sizeofarray;
        int[] array;
        TypesOfExceptions(int size){
            sizeofarray=size;
        }
        public void findException() {

            try {
                array = new int[sizeofarray];
                int len=sizeofarray;
                array[len+1]=23;
                String str=null;
                System.out.println(str.length());
            }
            catch (NegativeArraySizeException e) {
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            catch (NullPointerException e){
                System.out.println(e);
            }

        }
    }

