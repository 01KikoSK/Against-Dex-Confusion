private static final byte[] ENCRYPTED_API_KEY = {...};
private static final byte[] KEY_PART_1 = {...};
private static final byte[] KEY_PART_2 = {...};

private String getApiKey() {
    byte[] combinedKey = combine(KEY_PART_1, KEY_PART_2);
    byte[] decryptedKeyBytes = decrypt(ENCRYPTED_API_KEY, combinedKey);
    return new String(decryptedKeyBytes, StandardCharsets.UTF_8);
}