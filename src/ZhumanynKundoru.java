public enum ZhumanynKundoru {
    DUISHOMBU("Dyishombu Java okuim"),SHEISHEMBI("Sheishembi kunu angliski"),
    SHARSHEMBI("Sharshembi java"),BEISHEMBI("Beishembi soft skills "),JUMA("Juma Java"),
    ISHEMBI("Ishembi java oz aldyncha"),ZHEKSHEMBI("Jekshembi tapshyrma");
    private String jumanynKundoru;

    ZhumanynKundoru(String jumanynKundoru) {
        this.jumanynKundoru = jumanynKundoru;
    }

    public String getJumanynKundoru() {
        return jumanynKundoru;
    }

    public void setJumanynKundoru(String jumanynKundoru) {
        this.jumanynKundoru = jumanynKundoru;
    }

    @Override
    public String toString() {
        return "ZhumanynKundoru{ " +
                "jumanynKundoru= '" + jumanynKundoru + '\'' +
                '}';
    }
}
