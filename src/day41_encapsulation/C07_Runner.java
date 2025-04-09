package day41_encapsulation;

public class C07_Runner {

    public static void main(String[] args) {

        C06_EncapsuleClass obj = new C06_EncapsuleClass();


        /*
            Bir variable'i public yapmak ile

            private yapip
            hem getter, hem de setter olusturmak

            Ayni sey midir ?
            ayni degildir ama
            ikisi de kullanimda ayni islevlere
            yani hem read hem write yetkisine sahip olurlar


            hangisi daha avantajlidir ?

            Teknik olarak
            bir variable'i private yapip
            sonra hem getter hem setter olusturmak
            ekstra fayda saglamaz
            ama extra bir suru kod yazmamizi gerektirir

            AMMMMAAAA
            bazi developer'lar
            write ve read yetklilerine vurgu yapmak icin
            public yapmak yerine
            encapsule edip hem getter, hem setter olusturmayi
            tercih ederler
         */

        obj.intPub = 90;
        System.out.println(obj.intPub); // 90

        obj.setIntPri(100);
        System.out.println(obj.getIntPri()); // 100


    }
}
