# stage 1
FROM node:lts-alpine as node
ARG ACTIVE_PROFILE=development
ENV ACTIVE_PROFILE=$ACTIVE_PROFILE
WORKDIR /app
COPY . .
RUN yarn install
RUN yarn run build --configuration ${ACTIVE_PROFILE}

# stage 2
FROM nginx:alpine
COPY --from=node /app/dist /usr/share/nginx/html
COPY nginx.conf /etc/nginx/nginx.conf