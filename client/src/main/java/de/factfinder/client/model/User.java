/*
 * FACT-Finder REST-API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.factfinder.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.factfinder.client.model.Permissions;
import de.factfinder.client.model.UiSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a user, which should be created, and its settings.
 */
@ApiModel(description = "Represents a user, which should be created, and its settings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class User {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Permissions permissions;

  public static final String SERIALIZED_NAME_UI_SETTINGS = "uiSettings";
  @SerializedName(SERIALIZED_NAME_UI_SETTINGS)
  private UiSettings uiSettings;


  public User name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the user.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the user.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public User password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password of the user in plaintext.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "The password of the user in plaintext.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public User permissions(Permissions permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "")

  public Permissions getPermissions() {
    return permissions;
  }


  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
  }


  public User uiSettings(UiSettings uiSettings) {
    
    this.uiSettings = uiSettings;
    return this;
  }

   /**
   * Get uiSettings
   * @return uiSettings
  **/
  @ApiModelProperty(required = true, value = "")

  public UiSettings getUiSettings() {
    return uiSettings;
  }


  public void setUiSettings(UiSettings uiSettings) {
    this.uiSettings = uiSettings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.name, user.name) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.permissions, user.permissions) &&
        Objects.equals(this.uiSettings, user.uiSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password, permissions, uiSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    uiSettings: ").append(toIndentedString(uiSettings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
