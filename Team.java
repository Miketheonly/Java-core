public class Team {
        protected String name;
        protected Player[] teammates;

        public Team(String name,Player... teammates){
            this.name = name;
            this.teammates = teammates;
        }

    //       public String getName(){
    //        return new String(this.name);
    //    }

        public Player[] getTeammates(){
            return teammates.clone();
        }

        public void showSuccessfulResults(){
            for(Player c:this.teammates){
                if(c.isOnDistance())
                    c.info();
            }
        }

        public void showResults(){
            for(Player c:this.teammates){
                c.info();
            }
        }
    }

