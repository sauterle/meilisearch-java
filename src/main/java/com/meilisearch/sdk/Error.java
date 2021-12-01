package com.meilisearch.sdk;

import lombok.Data;

/** The code, type and error of the update status error */
@Data
public class Error {
	private String code = "";
	private String type = "";
	private String link = "";
}
