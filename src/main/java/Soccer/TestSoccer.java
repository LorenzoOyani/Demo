package Soccer;

public class TestSoccer {
    void main() {
        Object[] objects = {new generalPlay(), new PlayerShooting(), new Technique()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Soccer) {
                System.out.println(((((Soccer) objects[i]).howToScore())));
            }
            if (objects[i] instanceof Player) {
                System.out.println((((Player) objects[i]).kelvinDbruyne()));
            }

        }
    }

    abstract class Player {
        abstract String kelvinDbruyne();
    }


     class generalPlay extends Player implements Soccer {


        @Override
        public String howToDribble() {
            return "Always runs straight";
        }

         @Override
         public String howToShoot() {
             return "variety shot";
         }

         @Override
         public String crossing() {
             return "curvy";
         }

         public String howToScore() {
            return "he smashes it";
        }

        @Override
        String kelvinDbruyne() {
            return "shoots the ball";
        }
    }

    class PlayerShooting extends Player implements Soccer {


        @Override
        public String howToScore() {
            return "run it back";
        }

        @Override
        public String howToDribble() {
            return "body feint";
        }

        @Override
        public String howToShoot() {
            return "straight curve shot";
        }

        @Override
        public String crossing() {
            return "byLine";
        }

        @Override
        String kelvinDbruyne() {
            return "";
        }
    }

    class Technique extends Player implements Soccer{

        @Override
        public String howToScore() {
            return null;
        }

        @Override
        public String howToDribble() {
            return null;
        }

        @Override
        public String howToShoot() {
            return null;
        }

        @Override
        public String crossing() {
            return null;
        }

        @Override
        String kelvinDbruyne() {
            return null;
        }
    }


}