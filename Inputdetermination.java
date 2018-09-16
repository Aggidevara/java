public class Inputdetermination {
        public String inputDetermination(String input) {
                char c = input.charAt(0);
                if (c >= 65 && c <= 90) return "Capital letter";

                else if (c >= 97 && c <= 122) return "small letter";
                else if (c >= 48 && c <= 57) return "Digit";
                return null;
        }
}
