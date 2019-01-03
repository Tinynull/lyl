package singletonTest.register;

/**
 * 枚举单例也属于祖册单例的一种，例如worksheet项目中的用户角色.
 */
public enum Color {
    R() {
        private int r = 255;
        private int g = 0;
        private int b = 0;
    },
    G() {
        private int r = 0;
        private int g = 255;
        private int b = 0;
    },
    B() {
        private int r = 0;
        private int g = 0;
        private int b = 255;
    };
}
