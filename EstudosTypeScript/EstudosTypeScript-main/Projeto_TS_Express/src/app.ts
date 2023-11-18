// ENV Variables
require("dotenv").config();

import express from "express";
import config from "config";
import db from "../config/db";
import router from "./routes/router";
import routesSocio from "./routes/routesSocio";
import Logger from "../config/logger";
import morganMiddleware from "./middleware/morganMiddleware";
import routerMensalidade from "./routes/routerMensalidade";

const port = config.get<number>("port");

const app = express();

app.use(express.json());

app.use(morganMiddleware);

app.use("/api/", router);
app.use("/sociosSocamp/", routesSocio)
app.use("/mensalidadesSocamp/", routerMensalidade)

app.listen(port, async () => {
  await db();

  Logger.info(`App rodando na porta: ${port}`);
});