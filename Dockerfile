FROM hseeberger/scala-sbt as sal-scala-sbt
COPY . /project
WORKDIR /project
ENTRYPOINT /usr/bin/sbt
RUN sbt compile && sbt test
CMD run



