FROM hseeberger/scala-sbt:11.0.11_1.5.5_2.13.6

WORKDIR /app
COPY . /app

ENV KAFKA_BROKERS="34.29.132.138:9092,34.29.132.138:9094,34.29.132.138:9096"

RUN sbt compile

CMD sbt -DKAFKA_BROKERS=$KAFKA_BROKERS -Dconfig.override.with.environment.variables=true run
