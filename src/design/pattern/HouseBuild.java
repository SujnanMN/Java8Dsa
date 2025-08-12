package design.pattern;

public class HouseBuild {

    private String walls;
    private String roof;
    private String window;

    private HouseBuild(Builder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.window = builder.window;
    }

    static class Builder {
        private String walls;
        private String roof;
        private String window;

        public Builder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder setWindow(String window){
            this.window =  window;
            return this;
        }

        public HouseBuild build() {
            return new HouseBuild(this);
        }

    }
}
