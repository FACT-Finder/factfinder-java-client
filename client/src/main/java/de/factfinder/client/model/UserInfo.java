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
import java.util.Date;

/**
 * Represents a user and its settings.
 */
@ApiModel(description = "Represents a user and its settings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserInfo {
  public static final String SERIALIZED_NAME_LAST_ACTIVE = "lastActive";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVE)
  private Date lastActive;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * If the user is managed locally or remotely.
   */
  @JsonAdapter(OriginEnum.Adapter.class)
  public enum OriginEnum {
    LOCAL("LOCAL"),
    
    REMOTE("REMOTE");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OriginEnum fromValue(String value) {
      for (OriginEnum b : OriginEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OriginEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private OriginEnum origin;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Permissions permissions;

  public static final String SERIALIZED_NAME_UI_SETTINGS = "uiSettings";
  @SerializedName(SERIALIZED_NAME_UI_SETTINGS)
  private UiSettings uiSettings;


  public UserInfo lastActive(Date lastActive) {
    
    this.lastActive = lastActive;
    return this;
  }

   /**
   * Date of the last activity of the user or the creation date, when the user did not log in, yet.
   * @return lastActive
  **/
  @ApiModelProperty(required = true, value = "Date of the last activity of the user or the creation date, when the user did not log in, yet.")

  public Date getLastActive() {
    return lastActive;
  }


  public void setLastActive(Date lastActive) {
    this.lastActive = lastActive;
  }


  public UserInfo name(String name) {
    
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


  public UserInfo origin(OriginEnum origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * If the user is managed locally or remotely.
   * @return origin
  **/
  @ApiModelProperty(required = true, value = "If the user is managed locally or remotely.")

  public OriginEnum getOrigin() {
    return origin;
  }


  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }


  public UserInfo permissions(Permissions permissions) {
    
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


  public UserInfo uiSettings(UiSettings uiSettings) {
    
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
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.lastActive, userInfo.lastActive) &&
        Objects.equals(this.name, userInfo.name) &&
        Objects.equals(this.origin, userInfo.origin) &&
        Objects.equals(this.permissions, userInfo.permissions) &&
        Objects.equals(this.uiSettings, userInfo.uiSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastActive, name, origin, permissions, uiSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    sb.append("    lastActive: ").append(toIndentedString(lastActive)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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
