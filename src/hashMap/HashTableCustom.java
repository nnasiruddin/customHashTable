package hashMap;

public class HashTableCustom {
    HashMapEntry[] data;
    int TABLE_SIZE;
    int size;

    HashTableCustom (int tableSize) {
        this.TABLE_SIZE = tableSize;
        data = new HashMapEntry[TABLE_SIZE];
        this.size = 0;

        for(int i = 0; i < TABLE_SIZE; i++) {
            data[i] = null;
        }
    }

    public String get(String key) {
        int index = getHashCode(key) % TABLE_SIZE;
        if (data[index] == null) {
            return null;
        }
        else {
            HashMapEntry entry = data[index];

            while(entry != null) {
                if(entry.getKey().equals(key)) {
                    return entry.getValue();
                }
                entry = entry.getNext();
            }

            return null;
        }
    }

    public int getHashCode(String key) {
        int hashCode = key.hashCode();
        return hashCode;
    }

    public void put(String key, String value) throws IllegalArgumentException {
        if(value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        else {
            int index = getHashCode(key) % TABLE_SIZE;

            if(data[index] == null) {
                data[index] = new HashMapEntry(key, value);
                size++;
            }
            else {
                HashMapEntry entry = data[index];
                while(entry.getNext() != null) {
                    if(entry.getKey().equals(key)) {
                        entry.setValue(value);
                        return;
                    }
                    entry = entry.getNext();
                }

                HashMapEntry newEntry = new HashMapEntry(key, value);
                entry.setNext(newEntry);
                size++;
            }
        }
    }

    public int getSize() {
        return this.size;
    }
}
