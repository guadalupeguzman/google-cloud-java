// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/crawled_url.proto

package com.google.cloud.websecurityscanner.v1alpha;

public final class CrawledUrlProto {
  private CrawledUrlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_CrawledUrl_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_CrawledUrl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/websecurityscanner/v1alph"
          + "a/crawled_url.proto\022\'google.cloud.websec"
          + "urityscanner.v1alpha\032\034google/api/annotat"
          + "ions.proto\"<\n\nCrawledUrl\022\023\n\013http_method\030"
          + "\001 \001(\t\022\013\n\003url\030\002 \001(\t\022\014\n\004body\030\003 \001(\tB\233\001\n+com"
          + ".google.cloud.websecurityscanner.v1alpha"
          + "B\017CrawledUrlProtoP\001ZYgoogle.golang.org/g"
          + "enproto/googleapis/cloud/websecurityscan"
          + "ner/v1alpha;websecurityscannerb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_websecurityscanner_v1alpha_CrawledUrl_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_CrawledUrl_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_CrawledUrl_descriptor,
            new java.lang.String[] {
              "HttpMethod", "Url", "Body",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
