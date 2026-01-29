package org.evavdb1.whyphone;

public class WhyPhoneMainApp {

        public static void main(String[] args) {
            System.out.println();

            WhyPhone phone = new WhyPhone(249.99, "Siemens", "metallic");
            DummyPhone mobile = new DummyPhone(10.00,"Nokia");

            System.out.println("----- SmartPhone -----");
            System.out.println(phone);
            System.out.println();

            showSpecs(phone);

            System.out.println();
            System.out.println("----- DummyPhone -----");
            System.out.println(mobile);
            System.out.println();

            showSpecs(mobile);

        }

        public static void showSpecs(SmartPhone phone) {

            phone.startCall("797204");
            phone.endCall();
            phone.playChannel(102.10);
            phone.changeChannel(95.70);
            phone.connect("noPassword");
            phone.disconnect("noPassword");
            phone.locate(51.00, 4.30);
            phone.navigate();
            phone.shootAPhoto(12);
            phone.viewPhotos();

        }

        public static void showSpecs(DummyPhone mobile) {

            mobile.startCall("HELP");
            mobile.endCall();
            mobile.playChannel(95.70);
            mobile.changeChannel(101.50);

        }

    }
