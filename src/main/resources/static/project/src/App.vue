<template>
    <div id="app" class="container">
        <appheader></appheader>
        <div class="row">
            <div class="col s12">{{ twelve }}</div>
            <div clas   s="col s6">{{ six }}</div>
            <div class="col s6">{{ six }}</div>
        </div>
    </div>
</template>

<script>

import { mapState, mapActions } from 'vuex'
import AppHeader from '@/components/AppHeader'

export default {
    name: 'app',
    components: {
      AppHeader
    },
    data () {
        return {
            twelve: 'This div is 12-columns wide on all screen sizes',
            six: '6-columns (one-half)'
        }
    },
    computed: {
    },
    methods: {
    }
}

</script>