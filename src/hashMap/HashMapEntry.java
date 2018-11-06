package hashMap;

public class HashMapEntry {
    public HashMapEntry getNext() {
        return next;
    }

    public void setNext(HashMapEntry next) {
        this.next = next;
    }

    public String getKey() {
        return key;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private HashMapEntry next;
    private String key;
    private String value;

    HashMapEntry(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
