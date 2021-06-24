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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Group
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Group {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets roles
   */
  @JsonAdapter(RolesEnum.Adapter.class)
  public enum RolesEnum {
    ABTESTMANAGER("AbTestManager"),
    
    AFTERSEARCHNAVIGATIONMANAGER("AfterSearchNavigationManager"),
    
    BACKUPMANAGER("BackupManager"),
    
    CACHEMANAGER("CacheManager"),
    
    CAMPAIGNMANAGER("CampaignManager"),
    
    CONFIGURATORMANAGER("ConfiguratorManager"),
    
    DEPLOYMENTMANAGER("DeploymentManager"),
    
    IMPORTMANAGER("ImportManager"),
    
    INTERMEDIATEONLYIMPORTMANAGER("IntermediateOnlyImportManager"),
    
    INSTALLMANAGER("InstallManager"),
    
    LANGUAGEMANAGER("LanguageManager"),
    
    LOGFILEANALYZERMANAGER("LogfileAnalyzerManager"),
    
    MAYCHANGEPASSWORD("MayChangePassword"),
    
    MESSAGESMANAGER("MessagesManager"),
    
    NOTIFICATIONMANAGER("NotificationManager"),
    
    PREPROCESSORMANAGER("PreprocessorManager"),
    
    RANKINGMANAGER("RankingManager"),
    
    RECOMMENDATIONENGINEMANAGER("RecommendationEngineManager"),
    
    SEARCHINTERFACEUSER("SearchInterfaceUser"),
    
    SEARCHMANAGER("SearchManager"),
    
    SHOWHELPSECTION("ShowHelpSection"),
    
    SUGGESTMANAGER("SuggestManager"),
    
    THESAURUSMANAGER("ThesaurusManager"),
    
    USERMANAGER("UserManager"),
    
    WORDVALUESMANAGER("WordValuesManager"),
    
    APIIMPORT("ApiImport"),
    
    APIANALYTICS("ApiAnalytics"),
    
    APIPUBLICQUERIES("ApiPublicQueries"),
    
    APICONFIG("ApiConfig"),
    
    APIJOBS("ApiJobs"),
    
    APIINSTOREADS("ApiInstoreAds"),
    
    APIDATABASE("ApiDatabase"),
    
    APIMANAGE("ApiManage"),
    
    APILICENCE("ApiLicence"),
    
    APIUSERS("ApiUsers");

    private String value;

    RolesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RolesEnum fromValue(String value) {
      for (RolesEnum b : RolesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RolesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RolesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RolesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RolesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<RolesEnum> roles = new ArrayList<RolesEnum>();


  public Group name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the group.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the group.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Group roles(List<RolesEnum> roles) {
    
    this.roles = roles;
    return this;
  }

  public Group addRolesItem(RolesEnum rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The roles that will be assigned to the users who are part of this group.
   * @return roles
  **/
  @ApiModelProperty(required = true, value = "The roles that will be assigned to the users who are part of this group.")

  public List<RolesEnum> getRoles() {
    return roles;
  }


  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.name, group.name) &&
        Objects.equals(this.roles, group.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

