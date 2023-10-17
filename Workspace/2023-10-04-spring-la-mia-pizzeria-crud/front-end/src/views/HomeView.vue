<template>
  <main>
    <h1>Pizze</h1>    
  </main>
</template>

<script setup>
import { onMounted, ref } from 'vue';
import axios from "axios";

const API_URL = "http://localhost:8080/api/v1.0"

const pizze = ref(null);

onMounted(() => {

  axios.get(API_URL + "/pizzas")
       .then(res => {

          const data = res.data;
          pizze.value = data;
        })
       .catch(err => console.log(err));
});

</script>