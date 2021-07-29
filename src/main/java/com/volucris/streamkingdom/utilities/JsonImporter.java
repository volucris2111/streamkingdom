package com.volucris.streamkingdom.utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.volucris.streamkingdom.building.controller.BuildingController;

@Component
public class JsonImporter {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	public String getJsonFromFile(final String file) {
		final StringBuilder stringBuilder = new StringBuilder();
		InputStream inputStream = null;
		Scanner sc = null;
		try {
			inputStream = BuildingController.class.getResourceAsStream(file);
			sc = new Scanner(inputStream, StandardCharsets.UTF_8.name());
			while (sc.hasNextLine()) {
				stringBuilder.append(sc.nextLine());
			}
		} catch (final Exception e) {
			this.LOGGER.error(e.getMessage(), e);
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (final IOException e) {
				this.LOGGER.error(e.getMessage(), e);
			}
			try {
				if (sc != null) {
					sc.close();
				}
			} catch (final Exception e) {
				this.LOGGER.error(e.getMessage(), e);
			}
		}
		return stringBuilder.toString();
	}

	public void saveJson(final String file, final String json) {
		try {
			final FileWriter myWriter = new FileWriter("/resource/" + file);
			myWriter.write(json);
			myWriter.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
