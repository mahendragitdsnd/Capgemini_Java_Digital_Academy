
import java.util.function.Consumer;

class otp {
    public static void main(String[] args) {
        Consumer<String> smsNotifier = mobNo -> {
            System.out.println("Sending the OTP to ph no " + mobNo);
        };

        smsNotifier.accept("+91 9345678900");
    }
}
