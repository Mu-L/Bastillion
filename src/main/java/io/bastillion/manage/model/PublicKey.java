/**
 * Copyright (C) 2013 Loophole, LLC
 * <p>
 * Licensed under The Prosperity Public License 3.0.0
 */
package io.bastillion.manage.model;

import java.util.Date;

/**
 * public key value object
 */
public class PublicKey {
    
    // SSH Key Type Constants
    public static final String KEY_TYPE_RSA = "RSA";
    public static final String KEY_TYPE_DSA = "DSA";
    public static final String KEY_TYPE_ECDSA = "ECDSA";
    public static final String KEY_TYPE_ED25519 = "ED25519";
    public static final String KEY_TYPE_ED448 = "ED448";
    Long id;
    Long userId;
    String username;
    String keyNm;
    String publicKey;
    String type;
    String fingerprint;
    Boolean enabled;
    Date createDt;
    Profile profile;
    String passphrase;
    String passphraseConfirm;
    String keyType; // For form binding - user selected key type during generation


    public String getKeyNm() {
        return keyNm;
    }

    public void setKeyNm(String keyNm) {
        this.keyNm = keyNm;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassphraseConfirm() {
        return passphraseConfirm;
    }

    public void setPassphraseConfirm(String passphraseConfirm) {
        this.passphraseConfirm = passphraseConfirm;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }
}
