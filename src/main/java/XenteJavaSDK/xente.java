/*
 * Copyright (c) 2019. This software and it's likeness belong to Kintu Declan Trevor.
 * <d-kintu@outlook.com>
 * This software is open for usage and modification by any user.
 * Thank you.
 */

package XenteJavaSDK;

import XenteJavaSDK.components.account;
import XenteJavaSDK.components.paymentProvider;
import XenteJavaSDK.components.transaction;
import XenteJavaSDK.services.constant;
import XenteJavaSDK.services.tokenHandler;
import XenteJavaSDK.services.httpRequestClient;
import XenteJavaSDK.objectBodies.objectHandler;
import org.json.JSONObject;

import java.io.IOException;

public class xente {
    xente(JSONObject credentialsObject) throws IOException {
        final objectHandler objectHandler = new objectHandler(credentialsObject);
        new account(credentialsObject);
        new paymentProvider(credentialsObject);
        new transaction(credentialsObject);
        new objectHandler(credentialsObject);
        new httpRequestClient(credentialsObject, objectHandler);
        new constant(credentialsObject);
        new tokenHandler(credentialsObject);
    }
}
