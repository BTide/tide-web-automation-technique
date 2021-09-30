package tide.core.system.operating_system;

public enum OSType {
    Windows("win"),
    MacOS("mac"),
    Linux("linux"),
    Other("other");

    private String name;

    OSType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
