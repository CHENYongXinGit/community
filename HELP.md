# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.1.8.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


comment on column comment.parent_id is '父类ID';
comment on column comment.type is '父类类型';
comment on column comment.commentator is '评论人ID';
comment on column comment.gmt_create is '创建时间';
comment on column comment.gmt_modified is '更新时间';
comment on column comment.like_count is '点赞数';


mvn flyway:repair

mvn flyway:migrate

mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate