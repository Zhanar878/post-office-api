package kz.dar.academy.backend.model;

public class OfficeModel {
  public class ClientResponse {
    private String name;
      private String surname;
     private String email;
  }
    public class PostResponse {
        private String postId;
        private ClientResponse client;
        private ClientResponse receiver;
        private String postItem;
        private String status;
}}
